/**
 * Copyright @ 2010 Arun Gopalpuri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sourceforge.tess4j;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class TesseractException extends Exception {

	private static final long serialVersionUID = 5040724150209771469L;

	public TesseractException() {
		super();
	}

	public TesseractException(String message) {
		super(message);
	}

	public TesseractException(Throwable cause) {
		super(cause);
	}

	public TesseractException(String message, Throwable cause) {
		super(message, cause);
	}
}