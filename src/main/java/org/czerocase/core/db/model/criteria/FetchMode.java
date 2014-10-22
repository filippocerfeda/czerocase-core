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

package org.czerocase.core.db.model.criteria;

import java.util.HashMap;

public class FetchMode {

    private String name;

    private static HashMap<String, FetchMode> maps = new HashMap<String, FetchMode>();

    public static final String DEFAULT_ATTRIBUTE = "DEFAULT";

    public static final String JOIN_ATTRIBUTE = "JOIN";

    public static final String SELECT_ATTRIBUTE = "SELECT";

    static {
        if (maps.isEmpty()){
            maps.put(DEFAULT_ATTRIBUTE, new FetchMode(DEFAULT_ATTRIBUTE));
            maps.put(JOIN_ATTRIBUTE, new FetchMode(JOIN_ATTRIBUTE));
            maps.put(SELECT_ATTRIBUTE, new FetchMode(SELECT_ATTRIBUTE));
        }
    }
    public static final FetchMode DEFAULT = get(DEFAULT_ATTRIBUTE);
    public static final FetchMode JOIN = get(JOIN_ATTRIBUTE);
    public static final FetchMode SELECT = get(SELECT_ATTRIBUTE);

    private static FetchMode get(String name) {
        return maps.get(name);
    }

    private FetchMode(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
