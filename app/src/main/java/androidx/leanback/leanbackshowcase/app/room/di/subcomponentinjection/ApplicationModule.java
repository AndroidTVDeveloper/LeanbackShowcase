/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.leanback.leanbackshowcase.app.room.di.subcomponentinjection;


import android.app.Application;
import androidx.room.Room;
import androidx.leanback.leanbackshowcase.app.room.db.AppDatabase;
import androidx.leanback.leanbackshowcase.app.room.db.dao.CategoryDao;
import androidx.leanback.leanbackshowcase.app.room.db.dao.VideoDao;
import androidx.leanback.leanbackshowcase.app.room.di.viewmodel.ViewModelModule;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes= ViewModelModule.class)
public class ApplicationModule {

    @Singleton
    @Provides
    AppDatabase provideAppDatabase(Application app) {
        return Room.databaseBuilder(app, AppDatabase.class, AppDatabase.DATABASE_NAME).build();
    }

    @Singleton
    @Provides
    CategoryDao provideCategoryDao(AppDatabase db) {
        return db.categoryDao();
    }

    @Singleton
    @Provides
    VideoDao provideVideoDao(AppDatabase db) {
        return db.videoDao();
    }
}
