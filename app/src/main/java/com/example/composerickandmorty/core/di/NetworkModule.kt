package com.example.composerickandmorty.core.di

import com.example.composerickandmorty.data.network.character.CharacterApiClient
import com.example.composerickandmorty.data.network.episode.EpisodeApiClient
import com.example.composerickandmorty.data.network.location.LocationApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

private const val BASE_URL: String = "https://rickandmortyapi.com/api/"

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    //Retrofit
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    //Character Api Client
    @Singleton
    @Provides
    fun provideCharacterApiClient(retrofit: Retrofit): CharacterApiClient {
        return retrofit.create(CharacterApiClient::class.java)
    }

    //Episode Api Client
    @Singleton
    @Provides
    fun provideEpisodeApiClient(retrofit: Retrofit): EpisodeApiClient {
        return retrofit.create(EpisodeApiClient::class.java)
    }

    //Location Api Client
    @Singleton
    @Provides
    fun provideLocationApiClient(retrofit: Retrofit): LocationApiClient {
        return retrofit.create(LocationApiClient::class.java)
    }
}