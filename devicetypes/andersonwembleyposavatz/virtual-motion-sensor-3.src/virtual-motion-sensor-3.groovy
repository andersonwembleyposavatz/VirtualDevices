/**
 *  VIRTUAL Motion Sensor Generic
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
 *
 */
metadata {
	definition (name: "VIRTUAL Motion Sensor 3", namespace: "andersonwembleyposavatz", author: "Anderson W Posavatz",  ocfDeviceType: "x.com.st.d.sensor.motion", vid: "generic-motion-2") {
		capability "Actuator"
		capability "Door Control"
		capability "Contact Sensor"
		capability "Refresh"
		capability "Sensor"
		capability "Motion Sensor"
		capability "Health Check"
        
	}

	simulator {
		
	}

	tiles {
		standardTile("toggle", "device.motion", width: 2, height: 2) {
			state("closed", label:'${name}', action:"door control.open", icon:"st.motion.motion.inactive", backgroundColor:"#00A0DC", nextState:"opening")
			state("open", label:'${name}', action:"door control.close", icon:"st.motion.motion.active", backgroundColor:"#e86d13", nextState:"closing")
			state("opening", label:'${name}', icon:"st.motion.motion.inactive", backgroundColor:"#e86d13")
			state("closing", label:'${name}', icon:"st.motion.motion.active", backgroundColor:"#00A0DC")
			
		}
		standardTile("active", "device.motion",  width: 2, height: 2, decoration: "flat") {
			state "default", label:'Motion', action:"door control.open", icon:"st.motion.motion.active"
		}
		standardTile("inactive", "device.motion",  width: 2, height: 2, decoration: "flat") {
			state "default", label:'No Motion', action:"door control.close", icon:"st.motion.motion.inactive"
		}

		main "motion"
		details(["toggle", "open", "close", "on", "off", "active", "inactive"])
	}
}

def parse(String description) {
	log.trace "parse($description)"
}

def open() {
	sendEvent(name: "door", value: "open")
   	sendEvent(name: "motion", value: "active")
    runIn(1, finishOpening)
}

def close() {
    sendEvent(name: "door", value: "close")
    sendEvent(name: "motion", value: "inactive")
	runIn(1, finishClosing)
}

def on() {
	sendEvent(name: "door", value: "open")
   	sendEvent(name: "motion", value: "active")
    runIn(1, finishOpening)
}

def off() {
    sendEvent(name: "door", value: "close")
    sendEvent(name: "motion", value: "inactive")
	runIn(1, finishClosing)
}

def finishOpening() {
    sendEvent(name: "motion", value: "active")
    sendEvent(name: "door", value: "open")
    sendEvent(name: "contact", value: "open")
}

def finishClosing() {
    sendEvent(name: "motion", value: "inactive")
    sendEvent(name: "contact", value: "closed")
    sendEvent(name: "door", value: "closed")
}

def installed() {
    log.trace "Executing 'installed'"
	initialize()
}

def updated() {
	log.trace "Executing 'updated'"
	initialize()
}

private initialize() {
	log.trace "Executing 'initialize'"

	sendEvent(name: "DeviceWatch-DeviceStatus", value: "online")
	sendEvent(name: "healthStatus", value: "online")
	sendEvent(name: "DeviceWatch-Enroll", value: [protocol: "cloud", scheme:"untracked"].encodeAsJson(), displayed: false)
}