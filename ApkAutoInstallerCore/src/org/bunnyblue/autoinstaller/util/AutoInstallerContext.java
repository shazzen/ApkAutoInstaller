/**
 * ApkAutoInstaller Project
 The MIT License (MIT) Copyright (c) 2015 Bunny Blue<br>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package org.bunnyblue.autoinstaller.util;

import android.app.Application;
import android.content.Context;

/**
 * @author BunnyBlue
 *
 */
public class AutoInstallerContext {
	private static Context mContext;
	private static String targetService;
	private static String targetActivity;
	private static IApkInstaller mApkInstaller;

	public static void initApplication(Application mApplication, String targetService, String targetActivity) {
		mContext = mApplication.getApplicationContext();
		AutoInstallerContext.targetService = targetService;
		AutoInstallerContext.targetActivity = targetActivity;
	}

	public static Context getContext() {
		return mContext;
	}

	public static String getTargetService() {
		return targetService;
	}

	public static String getTargetActivity() {

		return targetActivity;

	}

	public static void setApkInstallMonitor(IApkInstaller mApkInstaller) {
		AutoInstallerContext.mApkInstaller = mApkInstaller;

	}

	public static IApkInstaller getApkInstallMonitor() {

		return mApkInstaller;
	}
}
