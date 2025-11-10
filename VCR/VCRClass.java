/*
Create an interface called VCR that has methods that represent the standard operations 
on a video cassette recorder (play, stop, etc.). Define the method signatures any way you desire.
Describe how a class called VCRClass implement this interface.
*/
package VCR;

/**
 * The VCRClass implements the VCR interface and represents a Video Cassette Recorder (VCR) with basic functionality.
 */
public class VCRClass implements VCR {
    private boolean playing;

    /**
     * Constructs a new VCRClass object.
     */
    VCRClass() {
    }

    /**
     * Begin playing the video.
     */
    @Override
    public void startPlay() {
        this.playing = true;
    }

    /**
     * Stop playing the video.
     */
    @Override
    public void stopPlay() {
        this.playing = false;
    }

    /**
     * Check if the VCR is currently playing a video.
     * 
     * @return true if the VCR is playing a video, false otherwise.
     */
    @Override
    public boolean isPlay() {
        return this.playing;
    }
}

// Draw a UML class diagram that shows the relationship among the elements this class with the VCR interface.

/*
-----------------------------
|        <<interface>>       |
|             VCR            |
|                            |
|    + startPlay(); void     |
|    + stopPlay(); void      |
|    + isPlay(); boolean     |
-----------------------------
            ^
            |
            |
            |
            |

-----------------------------
|         VCRClass           |
|    - playing: boolean      |
|                            |
|    + startPlay(); void     |
|    + stopPlay(); void      |
|    + isPlay(); boolean     |
-----------------------------
 */
 