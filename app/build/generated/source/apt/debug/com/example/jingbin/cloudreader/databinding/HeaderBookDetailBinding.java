package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class HeaderBookDetailBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_book_detail, 8);
    }
    // views
    public final android.widget.ImageView imgItemBg;
    public final android.widget.ImageView ivOnePhoto;
    public final android.widget.LinearLayout llBookDetail;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.TextView tvOneCasts;
    public final android.widget.TextView tvOneDirectors;
    public final android.widget.TextView tvOneGenres;
    public final android.widget.TextView tvOneRatingNumber;
    public final android.widget.TextView tvOneRatingRate;
    // variables
    private com.example.jingbin.cloudreader.bean.book.BooksBean mBooksBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderBookDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.imgItemBg = (android.widget.ImageView) bindings[1];
        this.imgItemBg.setTag(null);
        this.ivOnePhoto = (android.widget.ImageView) bindings[2];
        this.ivOnePhoto.setTag(null);
        this.llBookDetail = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOneCasts = (android.widget.TextView) bindings[6];
        this.tvOneCasts.setTag(null);
        this.tvOneDirectors = (android.widget.TextView) bindings[3];
        this.tvOneDirectors.setTag(null);
        this.tvOneGenres = (android.widget.TextView) bindings[7];
        this.tvOneGenres.setTag(null);
        this.tvOneRatingNumber = (android.widget.TextView) bindings[5];
        this.tvOneRatingNumber.setTag(null);
        this.tvOneRatingRate = (android.widget.TextView) bindings[4];
        this.tvOneRatingRate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
            case BR.booksBean :
                setBooksBean((com.example.jingbin.cloudreader.bean.book.BooksBean) variable);
                return true;
        }
        return false;
    }

    public void setBooksBean(com.example.jingbin.cloudreader.bean.book.BooksBean booksBean) {
        updateRegistration(2, booksBean);
        this.mBooksBean = booksBean;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.booksBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.book.BooksBean getBooksBean() {
        return mBooksBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRatingBooksB((com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean) object, fieldId);
            case 1 :
                return onChangeImagesBooksB((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
            case 2 :
                return onChangeBooksBean((com.example.jingbin.cloudreader.bean.book.BooksBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRatingBooksB(com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean ratingBooksBean, int fieldId) {
        switch (fieldId) {
            case BR.average: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.numRaters: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
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
    private boolean onChangeImagesBooksB(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesBooksBean, int fieldId) {
        switch (fieldId) {
            case BR.medium: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
                }
                return true;
            }
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x40L;
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
    private boolean onChangeBooksBean(com.example.jingbin.cloudreader.bean.book.BooksBean booksBean, int fieldId) {
        switch (fieldId) {
            case BR.images: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.author: {
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
            case BR.pubdate: {
                synchronized(this) {
                        mDirtyFlags |= 0x100L;
                }
                return true;
            }
            case BR.publisher: {
                synchronized(this) {
                        mDirtyFlags |= 0x200L;
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
        java.lang.String averageRatingBooksBe = null;
        java.lang.String mediumImagesBooksBea = null;
        java.util.List<java.lang.String> authorBooksBean = null;
        java.lang.String pubdateBooksBean = null;
        java.lang.String androidStringStringP = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean ratingBooksBean = null;
        java.lang.String largeImagesBooksBean = null;
        int numRatersRatingBooks = 0;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesBooksBean = null;
        java.lang.String stringFormatUtilForm = null;
        java.lang.String numRatersRatingBooks1 = null;
        java.lang.String androidStringStringR = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean booksBean = mBooksBean;
        java.lang.String publisherBooksBean = null;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x484L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.author
                        authorBooksBean = booksBean.getAuthor();
                    }


                    // read StringFormatUtil.formatGenres(booksBean.author)
                    stringFormatUtilForm = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(authorBooksBean);
            }
            if ((dirtyFlags & 0x504L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.pubdate
                        pubdateBooksBean = booksBean.getPubdate();
                    }
            }
            if ((dirtyFlags & 0x41dL) != 0) {

                    if (booksBean != null) {
                        // read booksBean.rating
                        ratingBooksBean = booksBean.getRating();
                    }
                    updateRegistration(0, ratingBooksBean);

                if ((dirtyFlags & 0x40dL) != 0) {

                        if (ratingBooksBean != null) {
                            // read booksBean.rating.average
                            averageRatingBooksBe = ratingBooksBean.getAverage();
                        }


                        // read (@android:string/string_rating) + (booksBean.rating.average)
                        androidStringStringR = (tvOneRatingRate.getResources().getString(R.string.string_rating)) + (averageRatingBooksBe);
                }
                if ((dirtyFlags & 0x415L) != 0) {

                        if (ratingBooksBean != null) {
                            // read booksBean.rating.numRaters
                            numRatersRatingBooks = ratingBooksBean.getNumRaters();
                        }


                        // read (booksBean.rating.numRaters) + (@android:string/string_rating_num)
                        numRatersRatingBooks1 = (numRatersRatingBooks) + (tvOneRatingNumber.getResources().getString(R.string.string_rating_num));
                }
            }
            if ((dirtyFlags & 0x466L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.images
                        imagesBooksBean = booksBean.getImages();
                    }
                    updateRegistration(1, imagesBooksBean);

                if ((dirtyFlags & 0x426L) != 0) {

                        if (imagesBooksBean != null) {
                            // read booksBean.images.medium
                            mediumImagesBooksBea = imagesBooksBean.getMedium();
                        }
                }
                if ((dirtyFlags & 0x446L) != 0) {

                        if (imagesBooksBean != null) {
                            // read booksBean.images.large
                            largeImagesBooksBean = imagesBooksBean.getLarge();
                        }
                }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (booksBean != null) {
                        // read booksBean.publisher
                        publisherBooksBean = booksBean.getPublisher();
                    }


                    // read (@android:string/string_publisher) + (booksBean.publisher)
                    androidStringStringP = (tvOneGenres.getResources().getString(R.string.string_publisher)) + (publisherBooksBean);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x426L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImgBg(this.imgItemBg, mediumImagesBooksBea);
        }
        if ((dirtyFlags & 0x446L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showBookImg(this.ivOnePhoto, largeImagesBooksBean);
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneCasts, pubdateBooksBean);
        }
        if ((dirtyFlags & 0x484L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneDirectors, stringFormatUtilForm);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneGenres, androidStringStringP);
        }
        if ((dirtyFlags & 0x415L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingNumber, numRatersRatingBooks1);
        }
        if ((dirtyFlags & 0x40dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneRatingRate, androidStringStringR);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static HeaderBookDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderBookDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HeaderBookDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.header_book_detail, root, attachToRoot, bindingComponent);
    }
    public static HeaderBookDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderBookDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.header_book_detail, null, false), bindingComponent);
    }
    public static HeaderBookDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static HeaderBookDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/header_book_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HeaderBookDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): booksBean.rating
        flag 1 (0x2L): booksBean.images
        flag 2 (0x3L): booksBean
        flag 3 (0x4L): booksBean.rating.average
        flag 4 (0x5L): booksBean.rating.numRaters
        flag 5 (0x6L): booksBean.images.medium
        flag 6 (0x7L): booksBean.images.large
        flag 7 (0x8L): booksBean.author
        flag 8 (0x9L): booksBean.pubdate
        flag 9 (0xaL): booksBean.publisher
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}