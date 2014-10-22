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


import java.util.List;
import java.util.Map;

import org.czerocase.core.db.model.ResultQuery;
import org.czerocase.core.db.model.criteria.Criterion;
import org.czerocase.core.db.model.criteria.FetchMode;
import org.czerocase.core.db.model.criteria.order.Order;

public interface DbConnector<ITEM, ID> {
    public ID save(ITEM item) ;

    public int update(String query);

    public ResultQuery executeQuery(String query);

    public void delete(ITEM item);

    public void update(ITEM item);

    public void saveOrUpdate(ITEM item);

    public List<ITEM> findAll();

    public List<ITEM> findAll(Order[] ordersRoles);

    public List<ITEM> findAll(Map<String, FetchMode> fetchModeMap);

    public List<ITEM> findAll(Map<String, FetchMode> fetchModeMap, Order [] orderRules) ;

    public ITEM findById(ID entityId);

    public List<ITEM> findByFilter(ITEM item);

    public List<ITEM> findByFilter(ITEM item, int startIndex, int numItems);

    public List<ITEM> findByFilter(ITEM item, Order [] orderRules);

    public List<ITEM> findByFilter(ITEM item, Order [] orderRules, int startIndex, int numItems);

    public List<ITEM> findByFilter(ITEM item, Map<String, FetchMode> fetchModes);

    public List<ITEM> findByFilter(ITEM item, Map<String, FetchMode> fetchModeMap, int startIndex, int numItems);

    public List<ITEM> findByFilter(ITEM item, Map<String, FetchMode> fetchModeMap, Order [] orderRules);

    public List<ITEM> findByFilter(ITEM item, Map<String, FetchMode> fetchModeMap, Order [] orderRules, int startIndex, int numItems);

    public List<ITEM> findByFilter(ITEM item, List<Criterion> additionalCriteria, Map<String, FetchMode> fetchModeMap);

    public List<ITEM> findByFilter(ITEM item, List<Criterion> additionalCriteria, Map<String, FetchMode> fetchModeMap, int startIndex, int numItems );

    public List<ITEM> findByFilter(ITEM item, List<Criterion> additionalCriteria, Map<String, FetchMode> fetchModeMap, Order[] orderrRoles, int startIndex, int numItems);

    public Class<?> getItemClass();
}