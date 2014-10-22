/*
 *  Czero Case is the Open Source Platform, realized by ImagoItalia Srl,
 *  to quickly develop and deploy innovative Case Management solutions.
 *  Czero Case framework, based on Java environment, enables designer
 *  and developers to build advanced solutions for document and process
 *  management ensuring compliance with government regulations
 *  and industry standards.
 * 
 *  Copyright (C) 2012 ImagoItalia srl <http://www.imagoitalia.com>
 *  
 *  This file is part of Czero Case.
 *  
 *  Czero Case is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *   
 *  Czero Case is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *   
 *  You should have received a copy of the GNU General Public License
 *  along with Czero Case.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.czerocase.core.db.model.util;

import java.util.Arrays;
import java.util.Collection;


public enum Operator {
    EQ("=") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addEquals(property, value);
        }
    },
    NE("<>") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addNotEquals(property, value);
        }
    },
    GT(">") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addGreaterThan(property, value);
        }
    },
    LT("<") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addLessThan(property, value);
        }
    },
    GE(">=") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addGreaterEquals(property, value);
        }
    },
    LE("<=") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addLessEquals(property, value);
        }
    },
    LIKE("LIKE") {
        public void dispatch(Builder builder, String property, Object value) {
            if (!(value instanceof String)) {
                throw new RuntimeException(
                        "The LIKE operator supports only values of type String");
            }
            builder.addLike(property, (String) value);
        }
    },
    ILIKE("ILIKE") {
        public void dispatch(Builder builder, String property, Object value) {
            if (!(value instanceof String)) {
                throw new RuntimeException(
                        "The ILIKE operator supports only values of type String");
            }
            builder.addIlike(property, (String) value);
        }
    },
    IN("IN") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addIn(property, IN.getCollectionValue(value));
        }
    },
    NOTIN("NOTIN") {
        public void dispatch(Builder builder, String property, Object value) {
            builder.addNotIn(property, NOTIN.getCollectionValue(value));
        }
    },
    ISNULL("ISNULL") {
        public void dispatch(Builder builder, String property, Object value) {
            //ignore value
            builder.addIsNull(property);
        }
    },
    ISNOTNULL("ISNOTNULL") {
        public void dispatch(Builder builder, String property, Object value) {
            //ignore value
            builder.addIsNotNull(property);
        }
    },
    IEQ("IEQ") {
        public void dispatch(Builder builder, String property, Object value) {
            //ignore value
            builder.addIEqual(property,(String)value);
        }
    };

    private String token;

    Operator(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token;
    }

    public abstract void dispatch(Builder builder, String property,
                                  Object value);

    private Collection<?> getCollectionValue(Object value) {
        Collection<?> collection = null;
        if (value != null) {
            if (value instanceof Collection) {
                collection = (Collection<?>) value;
            } else if (value.getClass().isArray()) {
                collection = Arrays.asList((Object[]) value);
            }
        }
        if (collection == null) {
            throw new RuntimeException("The "+this+" operator"
                    + "  supports only values of type Collection o Array");
        }
        return collection;
    }
}
