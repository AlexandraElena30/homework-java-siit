package com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial.exercise5.thirdpartyplugin;

import com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial.exercise5.musicplayer.Song;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class LocalFilesystemMusicLibrary implements com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial.exercise5.musicplayer.MusicLibrary {


    private final Set<Song> allSongs;

    public LocalFilesystemMusicLibrary(Song... allSongs) {
        this.allSongs = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(allSongs)));
    }

    @Override
    public Collection<Song> allSongs() {
        return allSongs;
    }

    @Override
    public int timesPlayed(Song song) {
        // Could read a local database file to find the number of times played
        return 4;
    }
}
