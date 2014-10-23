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
package org.czerocase.core.logging.exceptions;


public class LogException extends Exception
{
	private static final long serialVersionUID = 5572361201249030663L;
	private static final String JAVA_PACKAGE_PREFIX = "java.";

	private final String className;
    private final String message;
    private final String localizedMessage;

    public LogException(final Throwable exception)
    {
        className = exception.getClass().getName();
        message = exception.getMessage();
        localizedMessage = exception.getLocalizedMessage();
        setStackTrace(exception.getStackTrace());

        Throwable cause = exception.getCause();
        if (cause != null)
        {
            cause = getException(cause);
            initCause(cause);
        }
    }

    public String getMessage()
    {
        return className + ": " + message;
    }

    public String getLocalizedMessage()
    {
        return className + ": " + localizedMessage;
    }


    public static Throwable getException(final Throwable exception)
    {
        Throwable result = null;

        if (exception != null)
        {
            String className = exception.getClass().getName();
            if (exception.getCause() == null && className.startsWith(JAVA_PACKAGE_PREFIX))
            {
                result = exception;
            }
            else
            {
                result = new LogException(exception);
            }
        }

        return result;
    }
}