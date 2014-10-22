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

package org.czerocase.core.workflow.model.criteria;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProcessCriteria implements ProcessCriteria{
	private static int DEFAULT_MAX_RESULTS = 100;
	private List<ProcessFilter> filters;
	private int maxResults;
	private Object workflowSession;
	
	public AbstractProcessCriteria(Object workflowSession,List<ProcessFilter> filters,int maxResults) {
		this.workflowSession = workflowSession;
		this.filters = filters;
		this.maxResults = maxResults;
	}

	public AbstractProcessCriteria(List<ProcessFilter> filters, int maxResults) {
		this.filters = filters;
		this.maxResults = maxResults;
	}

	public AbstractProcessCriteria(List<ProcessFilter> filters) {
		this.filters = filters;
		this.maxResults = DEFAULT_MAX_RESULTS;
	}
	
	public AbstractProcessCriteria() {
		this.maxResults = DEFAULT_MAX_RESULTS;
		this.filters = new ArrayList<ProcessFilter>();
	}
	
	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	public int getMaxResults(){
		return this.maxResults;
	}
	public void setWorkflowSession(Object workflowSession){
		this.workflowSession = workflowSession;
	}
	public Object getWorkflowSession(){
		return this.workflowSession;
	}

	public List<ProcessFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<ProcessFilter> filters) {
		this.filters = filters;
	}

	public void addFilter(ProcessFilter filter){
		this.filters.add(filter);
	}
}
