/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of Adventuresmith.
 *
 * Adventuresmith is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Adventuresmith is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Adventuresmith.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.adventuresmith.app

import android.os.*
import android.support.v7.app.*
import com.mikepenz.materialize.*
import kotlinx.android.synthetic.main.activity_attribution.*
import org.stevesea.adventuresmith.*
import org.stevesea.adventuresmith.R

class AttributionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_attribution)

        setSupportActionBar(toolbar)

        supportActionBar!!.setTitle(R.string.nav_thanks)
        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        MaterializeBuilder()
                .withActivity(this)
                .withFullscreen(false)
                .withStatusBarPadding(true)
                .build()

        attribution_txt_content.text = ResultAdapterItem.htmlStrToSpanned(getString(R.string.content_attribution))
        attribution_txt_artwork.text = ResultAdapterItem.htmlStrToSpanned(getString(R.string.content_artwork))
        attribution_txt_thanks.text = ResultAdapterItem.htmlStrToSpanned(getString(R.string.content_thanks))
    }
}
