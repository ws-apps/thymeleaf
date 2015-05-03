/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.thymeleaf.text;

/**
 * <p>
 *     Common interface for repositories of text (<tt>String</tt>) instances created by the markup parser or
 *     document model.
 * </p>
 * <p>
 *     Implementations of this interface must be <strong>thread-safe</strong>.
 * </p>
 *
 * @author Daniel Fern&aacute;ndez
 *
 * @since 3.0.0
 *
 */
public interface ITextRepository {

    /**
     * <p>
     *     Retrieve the stored version of the text passed as argument.
     * </p>
     *
     * @param text the text to be retrieved.
     * @return the stored text.
     */
    public String getText(final CharSequence text);

    /**
     * <p>
     *     Retrieve the stored version of the text passed as argument.
     * </p>
     *
     * @param text the buffer containing the text to be retrieved.
     * @param offset tbe offset to be aplied to the text buffer.
     * @param len the length of the text in the specified buffer.
     * @return the stored text.
     */
    public String getText(final char[] text, final int offset, final int len);

}
