package VCR;

/**
 * The VCR interface represents a Video Cassette Recorder (VCR) with basic functionality.
 */
public interface VCR {

    /**
     * Begin playing the video.
     */
    public void startPlay();

    /**
     * Stop playing the video.
     */
    public void stopPlay();

    /**
     * Check if the VCR is currently playing a video.
     * 
     * @return true if the VCR is playing a video, false otherwise.
     */
    public boolean isPlay();
}
