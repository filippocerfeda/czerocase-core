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

package org.czerocase.core.ecm.model.criteria;


import java.util.ArrayList;
import java.util.List;

import org.czerocase.core.ecm.model.criteria.order.AbstractECMOrder;

/*
 * Abstract class for the criteria of search.
 * The search include the filter with the type Object to search.
 * e.g. for cmis: cmis:folder
 * @param filter ECMFilter 
 * @param order  to search
 * @parm maxResults 
 * @see ECMFilter
 * @see ECMOrder
 * @see ECMCriteria
 */
public abstract class AbstractECMCriteria implements ECMCriteria{
	private static int DEFAULT_MAX_RESULTS = 100;
	private List<ECMFilter> filters;
	private List<AbstractECMOrder> order;
	private String ecmType;
	private int maxResults;
	private Object ecmSession;
	
	public AbstractECMCriteria(Object ecmSession,String ecmType,List<ECMFilter> filters, List<AbstractECMOrder> order,
			int maxResults) {
		this.filters = filters;
		this.order = order;
		this.maxResults = maxResults;
		this.ecmSession = ecmSession;
	}

	public AbstractECMCriteria(String ecmType,List<ECMFilter> filters, int maxResults) {
		this.filters = filters;
		this.maxResults = maxResults;
		this.order = new ArrayList<AbstractECMOrder>();
	}

	public AbstractECMCriteria(String ecmType,List<ECMFilter> filters) {
		this.filters = filters;
		this.maxResults = DEFAULT_MAX_RESULTS;
		this.order = new ArrayList<AbstractECMOrder>();
	}
	
	public AbstractECMCriteria() {
		this.maxResults = DEFAULT_MAX_RESULTS;
		this.order = new ArrayList<AbstractECMOrder>();
		this.filters = new ArrayList<ECMFilter>();
	}
	
	public String getEcmType() {
		return ecmType;
	}

	public void setEcmType(String ecmType) {
		this.ecmType = ecmType;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	public int getMaxResults(){
		return this.maxResults;
	}
	public void setEcmSession(Object ecmsession){
		this.ecmSession = ecmsession;
	}
	public Object getEcmSession(){
		return this.ecmSession;
	}

	public List<ECMFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<ECMFilter> filters) {
		this.filters = filters;
	}

	public List<AbstractECMOrder> getOrder() {
		return order;
	}

	public void setOrder(List<AbstractECMOrder> order) {
		this.order = order;
	}
	
	public void addFilter(ECMFilter filter){
		this.filters.add(filter);
	}
}
