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


public class TaskFilter {
	private Process filter;
	private WorkflowCriteriaOperator operator;
	
	public TaskFilter(Process filter,WorkflowCriteriaOperator operator){
		this.filter = filter;
		this.operator = operator;
	}

	public Process getFilter() {
		return filter;
	}

	public void setFilter(Process filter) {
		this.filter = filter;
	}

	public WorkflowCriteriaOperator getOperator() {
		return operator;
	}

	public void setOperator(WorkflowCriteriaOperator operator) {
		this.operator = operator;
	}
	
}
