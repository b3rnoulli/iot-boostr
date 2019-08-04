package io.jenkins.plugins.sample;

public class UpdateTwinTask {

    private final String twinUrl;
    private final String dockerRepository;

    public UpdateTwinTask(String twinUrl, String dockerRepository) {
        this.twinUrl = twinUrl;
        this.dockerRepository = dockerRepository;
    }

    public void updateTwin(String imageName, String imageVersion, String pattern) {




    }

}
