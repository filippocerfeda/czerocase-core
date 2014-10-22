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

package org.czerocase.core.ecm.interfaces;


import java.util.List;

import org.czerocase.core.db.model.Attribute;
import org.czerocase.core.ecm.exceptions.ECMException;
import org.czerocase.core.ecm.model.Document;
import org.czerocase.core.ecm.model.ECMObject;
import org.czerocase.core.ecm.model.Folder;
import org.czerocase.core.ecm.model.criteria.AbstractECMCriteria;

/*
 * Interface to service ECM.
 * @see it.imago.czero.core.ecm.model.Folder
 * @see it.imago.czero.core.ecm.model.Document
 * @see it.imago.czero.core.ecm.model.ECMObject
 */
public interface ECMConnector {
	public Folder createFolder(Folder parentFolder,Folder folder) throws ECMException;
	public Document createDocument(Folder folder, Document document) throws ECMException;
	public Folder readFolder(String folderKey) throws ECMException;
	public Document readDocument(String documentKey) throws ECMException;
	public Folder readFolderByPath(String path) throws ECMException;
	public Document readDocumentByPath(String path) throws ECMException;
	public Boolean updateFolder(Folder folder) throws ECMException;
	public Boolean updateDocument(Document document) throws ECMException;
	public Boolean deleteFolder(Folder folder) throws ECMException;
	public Boolean deleteDocument(Document document) throws ECMException;
	public Boolean moveFolder(Folder folderFrom, Folder folderTo, Folder folder) throws ECMException;
	public Boolean moveDocument(Folder folderFrom, Folder folderTo, Document document) throws ECMException;
	public Boolean copyFolder(Folder folder, Folder folderTo) throws ECMException;
	public Boolean copyDocument(Folder folder, Document document) throws ECMException;
	public Boolean lock(Document document) throws ECMException;
	public Boolean unlock(Document document) throws ECMException;
	public Boolean hasChildren(Folder folder) throws ECMException;
	public Boolean hasParent(Folder folder) throws ECMException;
	public List<ECMObject> getChildren(Folder folder) throws ECMException;
	public List<Folder> getParent(Document document) throws ECMException;
	public List<Folder> getParent(Folder folder) throws ECMException;
	public Folder getRootFolder() throws ECMException;
	public Folder getMainFolder() throws ECMException;
	public List<Folder> searchFolder(AbstractECMCriteria criteria) throws ECMException;
	public List<Document> searchDocument(AbstractECMCriteria criteria) throws ECMException;
	public Folder readOrCreateMainFolder(String folderName) throws ECMException;
	public Document documentClone(Document document) throws ECMException;
	public Folder folderClone(Folder folder) throws ECMException;
	public void updateDocumentAttributes(String documentKey,List<Attribute<?>> attributes);
	public void updateFolderAttributes(String folderKey,List<Attribute<?>> attributes);
	public List<String> getDocumentTypes(String superClass);
	public List<String> getFolderTypes(String superClass);
	public ECMObject getDocumentType(String type);
	public ECMObject getFolderType(String type);
}
