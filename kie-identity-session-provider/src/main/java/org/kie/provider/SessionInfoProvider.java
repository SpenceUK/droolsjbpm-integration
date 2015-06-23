/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.provider;

import org.jboss.errai.security.shared.api.identity.User;
import org.uberfire.rpc.SessionInfo;

public interface SessionInfoProvider {
    
    public static final String UNKNOWN_SESSION_ID = "--";

    String getId();

    User getIdentity();
    
    SessionInfo getSessionInfo();
    
}
