/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.tooling.common.api.types;

import java.io.Serializable;

public interface IMixedStringHash extends IDictionary, Serializable
{
    public boolean isArray(String name);

    public boolean isBoolean(String name);

    public boolean isDouble(String name);

    public boolean isInteger(String name);

    public boolean isNumber(String name);

    public boolean isObject(String name);

    public boolean isString(String name);

    public boolean isNativeFunction(String name);
}
