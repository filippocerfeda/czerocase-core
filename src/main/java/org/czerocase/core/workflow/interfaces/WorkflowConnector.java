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

package org.czerocase.core.workflow.interfaces;


import java.util.List;

import org.czerocase.core.idm.model.Group;
import org.czerocase.core.idm.model.User;
import org.czerocase.core.workflow.exceptions.WorkflowException;
import org.czerocase.core.workflow.model.Comment;
import org.czerocase.core.workflow.model.Process;
import org.czerocase.core.workflow.model.ProcessResult;
import org.czerocase.core.workflow.model.Task;
import org.czerocase.core.workflow.model.Variable;

public interface WorkflowConnector {
	
	public List<Process> getCaseProcess(String caseKey) throws WorkflowException;
	
	public Process startProcess(Process process, User user, List<Variable<?>> variables) throws WorkflowException;
	
	public List<Task> getPendingTaskList() throws WorkflowException;
	
	public List<Task> getAssignedTaskList(User user) throws WorkflowException;
	
	public void assignTaskToUser(Task task, User user) throws WorkflowException;
	
	public void assignTaskToGroup(Task task, Group group) throws WorkflowException;
	
	public List<Task> getDelegatedTaskList(User owner) throws WorkflowException;
	
	public void delegate(Task task, User owner, User delegateUser) throws WorkflowException;
	
	public List<Task> getDelegationPendingTask() throws WorkflowException;
	
	public List<Task> getUserDelegatedPendingTask(User user) throws WorkflowException;
	
	public List<Task> getGroupTaskList(Group group, int first, int pageSize) throws WorkflowException;
	
	public Integer countGroupTaskList(Group group) throws WorkflowException;

	public List<Task> getUserTaskList(User user, int first, int pageSize) throws WorkflowException;
	
	public Integer countUserTaskList(User user) throws WorkflowException;

	public void acquireTask(Task task, User user) throws WorkflowException;

	public void completeTask(Task task, List<Variable<?>> variables) throws WorkflowException;
	
	public void resolveTask(Task task) throws WorkflowException;
	
	public void releaseTask(Task task) throws WorkflowException;
	
	public void addCommentToTask(Comment comment, Task task) throws WorkflowException;
	
	public Task getTask(Process process, User user) throws WorkflowException;
	
	public Task getTask(Process process, Task task) throws WorkflowException;
	
	public Variable<?> getTaskVariable(Task task, String variableName) throws WorkflowException;

	public List<Variable<?>> getTaskVariables(Task task) throws WorkflowException;

	public Variable<?> getProcessVariable(Process process, String variableName) throws WorkflowException;

	public List<Variable<?>> getProcessVariables(Process process) throws WorkflowException;
	
	public ProcessResult getProcessResult(Process process) throws WorkflowException;
	
	public Task getUserTaskDetail(User user, Variable<?> variable) throws WorkflowException;
	
	public void updateProcessVariable(Process process, Variable<?> variable) throws WorkflowException;
	
	public void updateTaskVariable(Task task, Variable<?> variable) throws WorkflowException;
	
	public Process getProcess(Process process) throws WorkflowException;
	
	public List<Process> getProcessList(String processName, String processVersion, int first, int pageSize) throws WorkflowException;
	
	public Integer countProcessList(String processName, String processVersion) throws WorkflowException;
	
	public List<Task> getProcessHistory(Process process) throws WorkflowException;
	
	public void closeProcess(Process process) throws WorkflowException;
}
