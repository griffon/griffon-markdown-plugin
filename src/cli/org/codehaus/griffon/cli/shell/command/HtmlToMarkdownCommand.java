/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.griffon.cli.shell.command;

import org.codehaus.griffon.cli.shell.AbstractGriffonCommand;
import org.codehaus.griffon.cli.shell.Argument;
import org.codehaus.griffon.cli.shell.Command;

import java.util.List;

/**
 * @author Andres Almiray
 */
@Command(scope = "markdown",
    name = "html-to-markdown",
    description = "Converts HTML sources to Markdown")
public class HtmlToMarkdownCommand extends AbstractGriffonCommand {
    @Argument(index = 0,
        name = "files",
        description = "Directories and/or files to be converted.",
        multiValued = true,
        required = true)
    private List<String> files;
}