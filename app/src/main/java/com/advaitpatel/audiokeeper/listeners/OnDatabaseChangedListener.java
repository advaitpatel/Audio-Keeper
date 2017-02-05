package com.advaitpatel.audiokeeper.listeners;

/**
 * Created by Advait on 02/04/2017.
 */

public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}