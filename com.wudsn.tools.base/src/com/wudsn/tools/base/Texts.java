/**
 * Copyright (C) 2013 - 2014 <a href="https://www.wudsn.com" target="_top">Peter Dell</a>
 *
 * This file is part of a WUDSN software distribution.
 * 
 * The!Cart Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * The!Cart Studio distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with the WUDSN software distribution. If not, see <https://www.gnu.org/licenses/>.
 */

package com.wudsn.tools.base;

import com.wudsn.tools.base.repository.NLS;

/**
 * Text repository.
 * 
 * @author Peter Dell
 */
public final class Texts extends NLS {

	// UI Texts: Update
	public static String UpdateDialog_Title;
	public static String UpdateDialog_Text;

	// UI Texts: Dialogs
	public static String HelpDialog_Title;

	static {
		initializeClass(Texts.class, null);
	}
}
