/**
 *  Sensor Temp Handler
 *
 *  Copyright 2021 Anderson W Posavatz
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
	definition (name: "Sensor Temp Handler", namespace: "andersonwembleyposavatz", author: "Anderson W Posavatz", cstHandler: true) {
		capability "Switch"
		capability "Switch Level"
		capability "Temperature Measurement"
		capability "Stateless Audio Volume Button"
		capability "Stateless Temperature Button"
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
	// TODO: handle 'switch' attribute
	// TODO: handle 'level' attribute
	// TODO: handle 'temperature' attribute
	// TODO: handle 'availableAudioVolumeButtons' attribute
	// TODO: handle 'availableTemperatureButtons' attribute

}

// handle commands
def on() {
	log.debug "Executing 'on'"
	// TODO: handle 'on' command
}

def off() {
	log.debug "Executing 'off'"
	// TODO: handle 'off' command
}

def setLevel() {
	log.debug "Executing 'setLevel'"
	// TODO: handle 'setLevel' command
}

def setButton() {
	log.debug "Executing 'setButton'"
	// TODO: handle 'setButton' command
}