/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package androidx.leanback.leanbackshowcase.app.details;

import android.app.Activity;
import android.os.Bundle;
import androidx.leanback.app.DetailsFragment;
import androidx.leanback.leanbackshowcase.R;

/**
 * Contains a {@link DetailsFragment} with video background in order to display more details
 * for a given card.
 */

public class DetailViewExampleWithVideoBackgroundActivity extends Activity {

    static final int BUY_MOVIE_REQUEST = 987;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_example);

        if (savedInstanceState == null) {
            DetailViewExampleWithVideoBackgroundFragment fragment =
                    new DetailViewExampleWithVideoBackgroundFragment();
            getFragmentManager().beginTransaction()
                    .replace(R.id.details_fragment, fragment)
                    .commit();
        }
    }
}
