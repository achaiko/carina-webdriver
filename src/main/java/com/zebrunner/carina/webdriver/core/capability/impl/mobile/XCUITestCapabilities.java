/*******************************************************************************
 * Copyright 2020-2022 Zebrunner Inc (https://www.zebrunner.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.zebrunner.carina.webdriver.core.capability.impl.mobile;

import com.zebrunner.carina.webdriver.core.capability.AbstractCapabilities;

import io.appium.java_client.ios.options.XCUITestOptions;

public class XCUITestCapabilities extends AbstractCapabilities<XCUITestOptions> {

    @Override
    public XCUITestOptions getCapability(String testName) {
        XCUITestOptions options = new XCUITestOptions();
        // this step should be executed before initCapabilities() to be able to override this capabilities by default appium approach.
        setLocaleAndLanguage(options);
        addConfigurationCapabilities(options);
        return options;
    }
}
