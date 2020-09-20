package com.example.hindivocal;

public class Word {
    /* Default translation for the word */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    private  int mAudio_R_id;

    // returning the resourse id of the images
    private static final int No_Image_id=-1;
    private int Resource_drawable_id=No_Image_id;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int Audio_Resource_id) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio_R_id=Audio_Resource_id;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getResource_drawable_id() {
        return Resource_drawable_id;
    }

    public  int getmAudio_R_id()
    {
        return mAudio_R_id;
    }

    // second Contructor
    public Word(String defaultTranslation,String miwokTranslation,int Image_Resourse_id,int Audio_Resource_id)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        Resource_drawable_id=Image_Resourse_id;
        mAudio_R_id=Audio_Resource_id;
    }
    public boolean hasImage()
    {
        return Resource_drawable_id!=No_Image_id;
    }
}
