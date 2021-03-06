package util.mimo.original.image.compress;


import android.content.Context;
import android.graphics.Bitmap;

import java.io.File;
import java.io.IOException;

/**
 * ============================================================================
 * Copyright (C) 2019 HexaBit Soft Solution - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p>
 * Created by: Mimo Saha on [27-Jan-2019 at 3:37 AM].
 * Email: hexa.bit.slash@gmail.com
 * <p>
 * Project: ImageCompress.
 * Code Responsibility: <Purpose of code>
 * <p>
 * Edited by :
 * --> <First Editor> on [27-Jan-2019 at 3:37 AM].
 * --> <Second Editor> on [27-Jan-2019 at 3:37 AM].
 * <p>
 * Reviewed by :
 * --> <First Reviewer> on [27-Jan-2019 at 3:37 AM].
 * --> <Second Reviewer> on [27-Jan-2019 at 3:37 AM].
 * ============================================================================
 **/
public class ImageCompressor {
    //max width and height values of the compressed image is taken as 612x816
    private int maxWidth = 612;
    private int maxHeight = 816;
    private Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
    private int quality = 80;
    private String destinationDirectoryPath;

    public ImageCompressor(Context context) {
        destinationDirectoryPath = context.getCacheDir().getPath() + File.separator + "images";
    }

    public ImageCompressor setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public ImageCompressor setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public ImageCompressor setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.compressFormat = compressFormat;
        return this;
    }

    public ImageCompressor setQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public ImageCompressor setDestinationDirectoryPath(String destinationDirectoryPath) {
        this.destinationDirectoryPath = destinationDirectoryPath;
        return this;
    }

    public File compressToFile(File imageFile) throws IOException {
        return compressToFile(imageFile, imageFile.getName());
    }

    public File compressToFile(File imageFile, String compressedFileName) throws IOException {
        return CompressUtil.compressImage(imageFile, maxWidth, maxHeight, compressFormat, quality,
                destinationDirectoryPath + File.separator + compressedFileName);
    }

    public Bitmap compressToBitmap(File imageFile) throws IOException {
        return CompressUtil.decodeSampledBitmapFromFile(imageFile, maxWidth, maxHeight);
    }

//    public Flowable<File> compressToFileAsFlowable(final File imageFile) {
//        return compressToFileAsFlowable(imageFile, imageFile.getName());
//    }
//
//    public Flowable<File> compressToFileAsFlowable(final File imageFile, final String compressedFileName) {
//        return Flowable.defer(new Callable<Flowable<File>>() {
//            @Override
//            public Flowable<File> call() {
//                try {
//                    return Flowable.just(compressToFile(imageFile, compressedFileName));
//                } catch (IOException e) {
//                    return Flowable.error(e);
//                }
//            }
//        });
//    }
//
//    public Flowable<Bitmap> compressToBitmapAsFlowable(final File imageFile) {
//        return Flowable.defer(new Callable<Flowable<Bitmap>>() {
//            @Override
//            public Flowable<Bitmap> call() {
//                try {
//                    return Flowable.just(compressToBitmap(imageFile));
//                } catch (IOException e) {
//                    return Flowable.error(e);
//                }
//            }
//        });
//    }
}
