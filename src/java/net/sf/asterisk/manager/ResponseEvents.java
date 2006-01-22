/*
 * Copyright  2004-2005 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package net.sf.asterisk.manager;

import java.util.Collection;

import net.sf.asterisk.manager.response.ManagerResponse;

/**
 * Contains the result of executing an EventGeneratingAction, that is the
 * ManagerResponse and any received ManagerEvents.
 * 
 * @see net.sf.asterisk.manager.action.EventGeneratingAction
 * @author srt
 * @version $Id: ResponseEvents.java,v 1.1 2005/07/16 21:48:15 srt Exp $
 * @since 0.2
 */
public interface ResponseEvents
{
    /**
     * Returns the ManagerResponse received.
     * 
     * @return the ManagerResponse received.
     */
    ManagerResponse getResponse();

    /**
     * Returns a Collection of ManagerEvents that have been received including
     * the last one that indicates completion.
     * 
     * @return a Collection of ManagerEvents received.
     */
    Collection getEvents();
}
