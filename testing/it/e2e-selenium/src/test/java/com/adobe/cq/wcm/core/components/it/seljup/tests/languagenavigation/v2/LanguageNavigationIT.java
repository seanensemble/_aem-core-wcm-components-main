/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2021 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

package com.adobe.cq.wcm.core.components.it.seljup.tests.languagenavigation.v2;

import org.apache.sling.testing.clients.ClientException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;

import com.adobe.cq.wcm.core.components.it.seljup.util.Commons;

@Tag("group2")
public class LanguageNavigationIT extends com.adobe.cq.wcm.core.components.it.seljup.tests.languagenavigation.v1.LanguageNavigationIT {

    private void setupResources() {
        languageNavigationRT = Commons.RT_LANGUAGE_NAVIGATION_V2;
    }

    @BeforeEach
    public void setupBeforeEach() throws ClientException {
        setupResources();
        setup();
    }
}
