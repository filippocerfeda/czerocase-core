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

package org.czerocase.core.workflow.model;


import java.io.Serializable;

import org.czerocase.core.idm.model.Group;
import org.czerocase.core.idm.model.User;

public class Assignee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5171522906918012785L;
	private boolean assigned;
	private boolean delegated;
	private User delegatedFrom;
	private Group group;
	private User user;
	
	public boolean isAssigned() {
		return assigned;
	}
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isDelegated() {
		return delegated;
	}
	public void setDelegated(boolean delegated) {
		this.delegated = delegated;
	}
	public User getDelegatedFrom() {
		return delegatedFrom;
	}
	public void setDelegatedFrom(User delegatedFrom) {
		this.delegatedFrom = delegatedFrom;
	}
}
