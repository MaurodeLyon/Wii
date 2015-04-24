/**
 * This file is part of WiiuseJ.
 *
 *  WiiuseJ is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  WiiuseJ is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with WiiuseJ.  If not, see <http://www.gnu.org/licenses/>.
 */
package wiiusej.utils;

import wiiusej.wiiusejevents.physicalevents.ExpansionEvent;
import wiiusej.wiiusejevents.physicalevents.GuitarHeroEvent;
import wiiusej.wiiusejevents.physicalevents.JoystickEvent;

/**
 * Panel to display Guitar Hero 3 controller joystick events.
 * 
 * @author guiguito
 */
public class GuitarHeroJoystickEventPanel extends JoystickEventPanel{

    @Override
    public JoystickEvent getJoystickEvent(ExpansionEvent e) {
        if (e instanceof GuitarHeroEvent){
            return ((GuitarHeroEvent)e).getGuitarHeroJoystickEvent();
        }
        return null;
    }

}
