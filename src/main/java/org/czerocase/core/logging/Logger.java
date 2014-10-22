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

package org.czerocase.core.logging;

public interface Logger {
	
	public static final int LOG_FATAL = 0;
	public static final int LOG_ERROR = 1;
	public static final int LOG_WARNING = 2;
	public static final int LOG_INFO = 3;
	public static final int LOG_DEBUG = 4;

	public void debug(Object message);
	
	public void debug(Class<?> clazz, Object message);

	public void debug(Class<?> clazz, Object message, Throwable t);

	public void info(Object message);
	
	public void info(Class<?> clazz, Object message);

	public void info(Class<?> clazz, Object message, Throwable t);

	public void warn(Class<?> clazz, Object message);

	public void warn(Class<?> clazz, Object message, Throwable t);

	public void error(Class<?> clazz, Object message);

	public void error(Class<?> clazz, Object message, Throwable t);

	public void fatal(Class<?> clazz, Object message);

	public void fatal(Class<?> clazz, Object message, Throwable t);

}
