/*
 * Copyright (C) 2011 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of AdAway.
 * 
 * AdAway is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AdAway is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AdAway.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.adaway.util;

import com.stericson.RootTools.RootTools;

public class Constants {
    /* DEBUG enables Log.d outputs wrapped in org.adaway.util.Log and RootTools Debug Mode */
    public static final boolean DEBUG = true;
    public static final boolean DEBUG_UPDATE_CHECK_SERVICE = false;
    public static final boolean DEBUG_DISABLE_ROOT_CHECK = false;

    // set RootTools to debug mode based on AdAway
    static {
        RootTools.debugMode = DEBUG;
    }

    public static final String TAG = "AdAway";

    public static final String PREFS_NAME = "preferences";

    public static final String LOCALHOST_IPv4 = "127.0.0.1";
    public static final String LOCALHOST_IPv6 = "::1";
    public static final String WHITELIST_ENTRY = "white";
    public static final String BOGUS_IPv4 = "0.0.0.0";
    public static final String LOCALHOST_HOSTNAME = "localhost";

    public static final String DOWNLOADED_HOSTS_FILENAME = "hosts_downloaded";
    public static final String HOSTS_FILENAME = "hosts";
    public static final String LINE_SEPERATOR = System.getProperty("line.separator", "\n");
    public static final String FILE_SEPERATOR = System.getProperty("file.separator", "/");

    public static final String COMMAND_COPY = "busybox cp -f";
    public static final String COMMAND_CHOWN = "busybox chown 0:0";
    public static final String COMMAND_CHMOD_644 = "busybox chmod 644";
    public static final String COMMAND_CHMOD_666 = "busybox chmod 666";
    public static final String COMMAND_LN = "busybox ln -s";
    public static final String COMMAND_RM = "busybox rm -f";
    public static final String COMMAND_MKDIR = "busybox mkdir -p";

    public static final String WEBSERVER_EXECUTEABLE = "blank_webserver";
    public static final int WEBSERVER_VERSION = 1;

    public static final String TCPDUMP_EXECUTEABLE = "tcpdump";
    public static final String TCPDUMP_LOG = "dns_log.txt";

    public static final String ANDROID_SYSTEM_PATH = System.getProperty("java.home", "/system");
    public static final String ANDROID_SYSTEM_ETC_HOSTS = ANDROID_SYSTEM_PATH + FILE_SEPERATOR
            + "etc" + FILE_SEPERATOR + HOSTS_FILENAME;
    public static final String ANDROID_DATA_DATA_HOSTS = FILE_SEPERATOR + "data" + FILE_SEPERATOR
            + "data" + FILE_SEPERATOR + HOSTS_FILENAME;

    public static final String HEADER1 = "# This hosts file is generated by AdAway.";
    public static final String HEADER2 = "# Please do not modify it directly, it will be overwritten when AdAway is applied again.";
    public static final String HEADER_SOURCES = "# This file is generated from the following sources:";

    public static final String HEADER_EXPORT = "# This hosts file contains exported entries from AdAway.";
}
