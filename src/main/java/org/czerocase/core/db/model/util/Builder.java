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

import java.util.Collection;

public interface Builder {
    public void addEquals(String property, Object value);

    public void addNotEquals(String property, Object value);

    public void addGreaterThan(String property, Object value);

    public void addLessThan(String property, Object value);

    public void addGreaterEquals(String property, Object value);

    public void addLessEquals(String property, Object value);

    public void addLike(String property, String value);

    public void addIlike(String property, String value);

    public void addIn(String property, Collection<?> value);

    public void addNotIn(String property, Collection<?> collectionValue);

    public void addIsNull(String property);

    public void addIsNotNull(String property);

	public void addIEqual(String property, String value);
}
