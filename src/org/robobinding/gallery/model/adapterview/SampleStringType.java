/**
 * Copyright 2012 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding.gallery.model.adapterview;

import java.util.Collections;
import java.util.List;

import org.robobinding.gallery.model.HasName;
import org.robobinding.internal.com_google_common.collect.Lists;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public enum SampleStringType implements HasName
{
	SAMPLE1("Sample strings 1", SampleStrings.getSample1()), 
	SAMPLE2("Sample strings 2", SampleStrings.getSample2());
	
	private String name;
	private List<String> sample;
	
	private SampleStringType(String name, List<String> sample)
	{
		this.name = name;
		this.sample = sample;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	public List<String> getSample()
	{
		return sample;
	}

	private static List<SampleStringType> types = Lists.newArrayList(SampleStringType.values());

	public static List<SampleStringType> types()
	{
		return Collections.unmodifiableList(types);
	}

	public static SampleStringType valueOf(int index)
	{
		return types.get(index);
	}
}