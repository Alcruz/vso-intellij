/*
 * Copyright 2000-2008 JetBrains s.r.o.
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
 */

package org.jetbrains.tfsIntegration.tests.conflicts;

@SuppressWarnings({"HardCodedStringLiteral"})
abstract class TestFileConflict extends TestSingleConflict {

  protected static final String BASE_FILENAME = "base.txt";
  protected static final String YOURS_FILENAME = "yours.txt";
  protected static final String THEIRS_FILENAME = "theirs.txt";
  protected static final String MERGED_FILENAME = "merged.txt";


  protected static final String BASE_CONTENT = "base_content";
  protected static final String THEIRS_CONTENT = "theirs_content";
  protected static final String YOURS_CONTENT = "yours_content";
  protected static final String MERGED_CONTENT = "merged_content";


}
