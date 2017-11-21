// Copyright 2016 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.bazel.repository.skylark;

import com.google.devtools.build.lib.concurrent.ThreadSafety.Immutable;
import com.google.devtools.build.lib.skylarkinterface.SkylarkCallable;
import com.google.devtools.build.lib.skylarkinterface.SkylarkModule;
import com.google.devtools.build.lib.skylarkinterface.SkylarkModuleCategory;

import java.util.Map;

/** A Skylark structure to deliver information about the current Python configuration. */
@Immutable
@SkylarkModule(
  name = "repository_python_config",
  category = SkylarkModuleCategory.NONE,
  doc = "Python configuration information."
)
final class SkylarkPythonConfig{

  SkylarkPythonConfig() {
  }

  @SkylarkCallable(name = "interpreter_path", structField = true,
      doc = "The path of the configured Python interpreter.")
  public String getPythonInterpreter() {
    return "foo";
  }
}
