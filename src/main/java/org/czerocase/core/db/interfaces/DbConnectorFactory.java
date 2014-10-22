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

package org.czerocase.core.db.interfaces;

import org.czerocase.core.idm.model.User;

import java.net.URL;
import java.util.List;

public interface DbConnectorFactory {

    public int initialize(String key, URL hibernateCfg, List<DbConnector<?,?>> connectors, URL... hbm);

    public int reinitialize(String key, boolean reinitialize, URL cfg, List<DbConnector<?,?>> connectors, URL... hbm);
    
    public int initialize(String key, User user, String url, String Driver, List<DbConnector<?,?>> connectors);

    public int reinitialize(String key, boolean reinitialize, User user, String url, String Driver, List<DbConnector<?,?>> connectors);

    public List<DbConnector<?,?>> getCase(String key);

    public void removeCase(String key);

}
