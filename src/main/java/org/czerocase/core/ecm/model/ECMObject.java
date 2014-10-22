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

package org.czerocase.core.ecm.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.czerocase.core.db.model.Attribute;


public class ECMObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3920642771843098328L;
	private List<Attribute> attributes;
	private Map<String,Permission> permissions;
	private String ecmType;
	private String ecmName;
	private String ecmId;
	private String ecmPath;
	
	public void addAttibute(Attribute attribute){
		this.attributes.add(attribute);
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(List<Attribute> attributes){
		this.attributes = attributes;
	}
	public Attribute getAttributeByName(String key) {
		for(Attribute attribute : getAttributes()){
			if(attribute.getKey().equals(key))
				return attribute;
		}
		return null;
	}
	
	public Attribute getAttributeByValue(Object value) {
		Attribute attr = new Attribute();
		//attribute.setKey("string");
		attr.setValue(value);
		attr.setValueClass(value.getClass());
		for(Attribute attribute : attributes){
			if(attribute.getValue().equals(value)){
				return attribute;
			}
		}
		return null;
	}
	
	public void setAttributeByName(String key,Object value) {
		for(Attribute attribute : getAttributes()){
			if(attribute.getKey().equals(key))
				attribute.setValue(value);
		}
	}
	
	public String getKey(String id) {
		return (String) getAttributeByName(id).getValue();
	}
	
	public Map<String,Permission> getPermissions() {
		return permissions;
	}
	
	public void setPermissions(Map<String,Permission> permissions) {
		this.permissions = permissions;
	}
	
	public Permission getUserPermissions(String user) {
		return permissions.get(user);
	}

	public void setUserPermissions(String user,Permission permissions) {
		this.permissions.put(user, permissions);
	}

	public String getEcmType() {
		return ecmType;
	}
	public void setEcmType(String ecmType) {
		this.ecmType = ecmType;
	}
	public String getEcmName() {
		return ecmName;
	}
	public void setEcmName(String ecmName) {
		this.ecmName = ecmName;
	}
	public String getEcmId() {
		return ecmId;
	}
	public void setEcmId(String ecmId) {
		this.ecmId = ecmId;
	}
	public String getEcmPath() {
		return ecmPath;
	}
	public void setEcmPath(String ecmPath) {
		this.ecmPath = ecmPath;
	}
	public Boolean useHasPermissions(String user,Permission permission){
		Permission p = getUserPermissions(user);
		return (p.getRead().equals(permission.getRead())
					&& p.getWrite().equals(permission.getWrite())
					&& p.getLock().equals(permission.getLock())
					&& p.getAll().equals(permission.getAll()) ? true : false);
	}
	@Override
	public String toString() {
		return "ECMObject [attributes=" + attributes + ", permissions="
				+ permissions + ", ecmType=" + ecmType + ", ecmName=" + ecmName
				+ ", ecmId=" + ecmId + "]";
	}
	
}
