package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivityMovieHeaderBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_one_item, 8);
    }
    // views
    public final android.widget.ImageView imgItemBg;
    public final android.widget.ImageView ivOnePhoto;
    public final android.widget.LinearLayout llOneItem;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.TextView tvOneCasts;
    public final android.widget.TextView tvOneDirectors;
    public final android.widget.TextView tvOneGenres;
    public final android.widget.TextView tvOneRatingRate;
    public final android.widget.TextView tvOneTitle;
    // variables
    private com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean mSubjectsBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieHeaderBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.imgItemBg = (android.widget.ImageView) bindings[1];
        this.imgItemBg.setTag(null);
        this.ivOnePhoto = (android.widget.ImageView) bindings[2];
        this.ivOnePhoto.setTag(null);
        this.llOneItem = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOneCasts = (android.widget.TextView) bindings[5];
        this.tvOneCasts.setTag(null);
        this.tvOneDirectors = (android.widget.TextView) bindings[4];
        this.tvOneDirectors.setTag(null);
        this.tvOneGenres = (android.widget.TextView) bindings[6];
        this.tvOneGenres.setTag(null);
        this.tvOneRatingRate = (android.widget.TextView) bindings[7];
        this.tvOneRatingRate.setTag(null);
        this.tvOneTitle = (android.widget.TextView) bindings[3];
        this.tvOneTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.subjectsBean :
                setSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) variable);
                return true;
        }
        return false;
    }

    public void setSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean) {
        updateRegistration(1, subjectsBean);
        this.mSubjectsBean = subjectsBean;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subjectsBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean getSubjectsBean() {
        return mSubjectsBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRatingSubjec((com.example.jingbin.cloudreader.bean.moviechild.RatingBean) object, fieldId);
            case 1 :
                return onChangeSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) object, fieldId);
            case 2 :
                return onChangeImagesSubjec((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRatingSubjec(com.example.jingbin.cloudreader.bean.moviechild.RatingBean ratingSubjectsBean, int fieldId) {
        switch (fieldId) {
            case BR.average: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean, int fieldId) {
        switch (fieldId) {
            case BR.images: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.title: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
                }
                return true;
            }
            case BR.directors: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
                }
                return true;
            }
            case BR.casts: {
                synchronized(this) {
                        mDirtyFlags |= 0x40L;
                }
                return true;
            }
            case BR.genres: {
                synchronized(this) {
                        mDirtyFlags |= 0x80L;
                }
                return true;
            }
            case BR.rating: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeImagesSubjec(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesSubjectsBean, int fieldId) {
        switch (fieldId) {
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x100L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<java.lang.String> genresSubjectsBean = null;
        com.example.jingbin.cloudreader.bean.moviechild.RatingBean ratingSubjectsBean = null;
        java.lang.String titleSubjectsBean = null;
        com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean = mSubjectsBean;
        java.lang.String stringFormatUtilForm = null;
        java.util.List<com.example.jingbin.cloudreader.bean.moviechild.PersonBean> castsSubjectsBean = null;
        double averageRatingSubject = 0.0;
        java.lang.String androidStringStringT = null;
        java.lang.String StringFormatUtilForm1 = null;
        java.lang.String StringFormatUtilForm2 = null;
        java.lang.String largeImagesSubjectsB = null;
        java.util.List<com.example.jingbin.cloudreader.bean.moviechild.PersonBean> directorsSubjectsBea = null;
        java.lang.String androidStringStringR = null;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesSubjectsBean = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x282L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.genres
                        genresSubjectsBean = subjectsBean.getGenres();
                    }


                    // read StringFormatUtil.formatGenres(subjectsBean.genres)
                    StringFormatUtilForm2 = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(genresSubjectsBean);


                    // read (@android:string/string_type) + (StringFormatUtil.formatGenres(subjectsBean.genres))
                    androidStringStringT = (tvOneGenres.getResources().getString(R.string.string_type)) + (StringFormatUtilForm2);
            }
            if ((dirtyFlags & 0x20bL) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.rating
                        ratingSubjectsBean = subjectsBean.getRating();
                    }
                    updateRegistration(0, ratingSubjectsBean);


                    if (ratingSubjectsBean != null) {
                        // read subjectsBean.rating.average
                        averageRatingSubject = ratingSubjectsBean.getAverage();
                    }


                    // read (@android:string/string_rating) + (subjectsBean.rating.average)
                    androidStringStringR = (tvOneRatingRate.getResources().getString(R.string.string_rating)) + (averageRatingSubject);
            }
            if ((dirtyFlags & 0x212L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.title
                        titleSubjectsBean = subjectsBean.getTitle();
                    }
            }
            if ((dirtyFlags & 0x242L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.casts
                        castsSubjectsBean = subjectsBean.getCasts();
                    }


                    // read StringFormatUtil.formatName(subjectsBean.casts)
                    StringFormatUtilForm1 = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatName(castsSubjectsBean);
            }
            if ((dirtyFlags & 0x222L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.directors
                        directorsSubjectsBea = subjectsBean.getDirectors();
                    }


                    // read StringFormatUtil.formatName(subjectsBean.directors)
                    stringFormatUtilForm = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatName(directorsSubjectsBea);
            }
            if ((dirtyFlags & 0x306L) != 0) {

                    if (subjectsBean != null) {
                        // read subjectsBean.images
                        imagesSubjectsBean = subjectsBean.getImages();
                    }
                    updateRegistration(2, imagesSubjectsBean);


                    if (imagesSubjectsBean != null) {
                        // read subjectsBean.images.large
                        largeImagesSubjectsB = imagesSubjectsBean.getLarge();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x306L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImgBg(this.imgItemBg, largeImagesSubjectsB);
            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImg(this.ivOnePhoto, largeImagesSubjectsB);
        }
        if ((dirtyFlags & 0x242L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneCasts, StringFormatUtilForm1);
        }
        if ((dirtyFlags & 0x222L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneDirectors, stringFormatUtilForm);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneGenres, androidStringStringT);
        }
        if ((dirtyFlags & 0x20bL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingRate, androidStringStringR);
        }
        if ((dirtyFlags & 0x212L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneTitle, titleSubjectsBean);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMovieHeaderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieHeaderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMovieHeaderBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_movie_header, root, attachToRoot, bindingComponent);
    }
    public static ActivityMovieHeaderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieHeaderBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_movie_header, null, false), bindingComponent);
    }
    public static ActivityMovieHeaderBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMovieHeaderBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_movie_header_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMovieHeaderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subjectsBean.rating
        flag 1 (0x2L): subjectsBean
        flag 2 (0x3L): subjectsBean.images
        flag 3 (0x4L): subjectsBean.rating.average
        flag 4 (0x5L): subjectsBean.title
        flag 5 (0x6L): subjectsBean.directors
        flag 6 (0x7L): subjectsBean.casts
        flag 7 (0x8L): subjectsBean.genres
        flag 8 (0x9L): subjectsBean.images.large
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}