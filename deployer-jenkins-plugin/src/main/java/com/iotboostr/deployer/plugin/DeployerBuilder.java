package com.iotboostr.deployer.plugin;

import hudson.AbortException;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import jenkins.tasks.SimpleBuildStep;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.io.IOException;

public class DeployerBuilder extends Builder implements SimpleBuildStep {

    private String twinUrl;

    /**
     * Creates new DeployerBuilder
     *
     * @param twinUrl points to url of the device twin which will handle the deployment
     */
    @DataBoundConstructor
    public DeployerBuilder(String twinUrl) {
        this.twinUrl = twinUrl;
    }

    @Override
    public void perform(@Nonnull Run<?, ?> run, @Nonnull FilePath workspace, @Nonnull Launcher launcher, @Nonnull TaskListener listener) throws InterruptedException, IOException {
        UpdateTwinTask task = new UpdateTwinTask(twinUrl, timeout);
        if (task.perform(workspace, run, launcher, listener)) {
            throw new AbortException("Unable to update device configuration in twin url:[" + twinUrl + "]")
        }
    }
}
