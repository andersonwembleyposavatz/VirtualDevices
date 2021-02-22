/**
 *  VIRTUAL TESTE FOR SHADES
 *
 *  Copyright 2021 Anderson Posavatz
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "VIRTUAL TESTE FOR SHADES", namespace: "andersonwembleyposavatz", author: "Anderson Posavatz", cstHandler: true) {
		capability "Stateless Curtain Power Button"
		//capability "Window Shade"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'supportedLanguages' attribute
	// TODO: handle 'availableCurtainPowerButtons' attribute
	// TODO: handle 'supportedWindowShadeCommands' attribute

}

// handle commands
def setLanguage() {
	log.debug "Executing 'setLanguage'"
	// TODO: handle 'setLanguage' command
}

def setButton() {
	log.debug "Executing 'setButton'"
	// TODO: handle 'setButton' command
}

def open() {
	log.debug "Executing 'open'"
	// TODO: handle 'open' command
}

def close() {
	log.debug "Executing 'close'"
	// TODO: handle 'close' command
}

def pause() {
	log.debug "Executing 'pause'"
	// TODO: handle 'pause' command
}