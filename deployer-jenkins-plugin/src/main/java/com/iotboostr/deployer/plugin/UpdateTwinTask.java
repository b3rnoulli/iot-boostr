package com.iotboostr.deployer.plugin;

import hudson.FilePath;
import hudson.Launcher;
import hudson.model.Run;
import hudson.model.TaskListener;

public class UpdateTwinTask {

    private final String twinUrl;
    private final long timeout;

    public UpdateTwinTask(String twinUrl, long timeout) {
        this.twinUrl = twinUrl;
        this.timeout = timeout;
    }


    public boolean perform(FilePath workspace, Run run, Launcher launcher, TaskListener listener) {

        listener.getLogger().println("Cloud Foundry Plugin:");

        try {

        } catch (Exception e){

        }



    }
}
