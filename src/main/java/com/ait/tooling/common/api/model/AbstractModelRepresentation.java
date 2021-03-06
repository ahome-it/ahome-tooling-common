/*
   Copyright (c) 2017 Ahome' Innovation Technologies. All rights reserved.

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

package com.ait.tooling.common.api.model;

import java.util.Objects;

public abstract class AbstractModelRepresentation<T> implements IModel<T>
{
    private final T m_model;

    protected AbstractModelRepresentation(final T model)
    {
        m_model = Objects.requireNonNull(model);
    }

    @Override
    public T getModel()
    {
        return m_model;
    }
}
