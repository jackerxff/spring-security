/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acegisecurity.providers.portlet;

import org.acegisecurity.userdetails.UserDetails;

/**
 * Provides a cache of {@link UserDetails} objects for the
 * {@link PortletAuthenticationProvider}.
 *
 * @author John A. Lewis
 * @since 2.0
 * @version $Id$
 */
public interface UserCache {

	//~ Methods ========================================================================================================

	public UserDetails getUserFromCache(String username);

	public void putUserInCache(UserDetails user);

	public void removeUserFromCache(String username);

}