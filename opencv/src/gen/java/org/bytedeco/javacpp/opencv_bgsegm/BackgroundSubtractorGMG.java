// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_bgsegm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;

import static org.bytedeco.javacpp.opencv_bgsegm.opencv_bgsegm.*;



/** \brief Background Subtractor module based on the algorithm given in \cite Gold2012 .
 <p>
 Takes a series of images and returns a sequence of mask (8UC1)
 images of the same size, where 255 indicates Foreground and 0 represents Background.
 This class implements an algorithm described in "Visual Tracking of Human Visitors under
 Variable-Lighting Conditions for a Responsive Audio Art Installation," A. Godbehere,
 A. Matsukawa, K. Goldberg, American Control Conference, Montreal, June 2012.
 */
@Namespace("cv::bgsegm") @Properties(inherit = org.bytedeco.javacpp.opencv_bgsegm.opencv_bgsegm_presets.class)
public class BackgroundSubtractorGMG extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorGMG(Pointer p) { super(p); }

    /** \brief Returns total number of distinct colors to maintain in histogram.
    */
    public native int getMaxFeatures();
    /** \brief Sets total number of distinct colors to maintain in histogram.
    */
    public native void setMaxFeatures(int maxFeatures);

    /** \brief Returns the learning rate of the algorithm.
    <p>
    It lies between 0.0 and 1.0. It determines how quickly features are "forgotten" from
    histograms.
     */
    public native double getDefaultLearningRate();
    /** \brief Sets the learning rate of the algorithm.
    */
    public native void setDefaultLearningRate(double lr);

    /** \brief Returns the number of frames used to initialize background model.
    */
    public native int getNumFrames();
    /** \brief Sets the number of frames used to initialize background model.
    */
    public native void setNumFrames(int nframes);

    /** \brief Returns the parameter used for quantization of color-space.
    <p>
    It is the number of discrete levels in each channel to be used in histograms.
     */
    public native int getQuantizationLevels();
    /** \brief Sets the parameter used for quantization of color-space
    */
    public native void setQuantizationLevels(int nlevels);

    /** \brief Returns the prior probability that each individual pixel is a background pixel.
    */
    public native double getBackgroundPrior();
    /** \brief Sets the prior probability that each individual pixel is a background pixel.
    */
    public native void setBackgroundPrior(double bgprior);

    /** \brief Returns the kernel radius used for morphological operations
    */
    public native int getSmoothingRadius();
    /** \brief Sets the kernel radius used for morphological operations
    */
    public native void setSmoothingRadius(int radius);

    /** \brief Returns the value of decision threshold.
    <p>
    Decision value is the value above which pixel is determined to be FG.
     */
    public native double getDecisionThreshold();
    /** \brief Sets the value of decision threshold.
    */
    public native void setDecisionThreshold(double thresh);

    /** \brief Returns the status of background model update
    */
    public native @Cast("bool") boolean getUpdateBackgroundModel();
    /** \brief Sets the status of background model update
    */
    public native void setUpdateBackgroundModel(@Cast("bool") boolean update);

    /** \brief Returns the minimum value taken on by pixels in image sequence. Usually 0.
    */
    public native double getMinVal();
    /** \brief Sets the minimum value taken on by pixels in image sequence.
    */
    public native void setMinVal(double val);

    /** \brief Returns the maximum value taken on by pixels in image sequence. e.g. 1.0 or 255.
    */
    public native double getMaxVal();
    /** \brief Sets the maximum value taken on by pixels in image sequence.
    */
    public native void setMaxVal(double val);
}