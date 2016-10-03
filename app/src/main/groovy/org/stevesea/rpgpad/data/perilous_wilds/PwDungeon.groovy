/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of RPG-Pad.
 *
 * RPG-Pad is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RPG-Pad is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RPG-Pad.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.rpgpad.data.perilous_wilds

import groovy.transform.CompileStatic
import org.stevesea.rpgpad.data.AbstractGenerator
import org.stevesea.rpgpad.data.RangeMap
import org.stevesea.rpgpad.data.Shuffler

import javax.inject.Inject;

@CompileStatic
class PwDungeon extends AbstractGenerator{
    @Inject
    PwDungeon(Shuffler shuffler) {
        super(shuffler)
    }

    @Override
    String generate() {
        return "Dungeon TBD"
    }

    RangeMap asdfasdf = new RangeMap()
            .with(1, '')
            .with(2, '')
            .with(3, '')
            .with(4, '')
            .with(5, '')
            .with(6, '')
            .with(7, '')
            .with(8, '')
            .with(9, '')
            .with(10, '')
            .with(11, '')
            .with(12, '')
}
