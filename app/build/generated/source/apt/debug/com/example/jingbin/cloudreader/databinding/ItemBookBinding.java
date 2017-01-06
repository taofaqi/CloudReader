package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemBookBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView ivTopPhoto;
    public final android.widget.LinearLayout llItemTop;
    public final android.widget.TextView tvName;
    public final android.widget.TextView tvRate;
    // variables
    private com.example.jingbin.cloudreader.bean.book.BooksBean mBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBookBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.ivTopPhoto = (android.widget.ImageView) bindings[1];
        this.ivTopPhoto.setTag(null);
        this.llItemTop = (android.widget.LinearLayout) bindings[0];
        this.llItemTop.setTag(null);
        this.tvName = (android.widget.TextView) bindings[2];
        this.tvName.setTag(null);
        this.tvRate = (android.widget.TextView) bindings[3];
        this.tvRate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            case BR.bean :
                setBean((com.example.jingbin.cloudreader.bean.book.BooksBean) variable);
                return true;
        }
        return false;
    }

    public void setBean(com.example.jingbin.cloudreader.bean.book.BooksBean bean) {
        updateRegistration(0, bean);
        this.mBean = bean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.book.BooksBean getBean() {
        return mBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBean((com.example.jingbin.cloudreader.bean.book.BooksBean) object, fieldId);
            case 1 :
                return onChangeImagesBean((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
            case 2 :
                return onChangeRatingBean((com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBean(com.example.jingbin.cloudreader.bean.book.BooksBean bean, int fieldId) {
        switch (fieldId) {
            case BR.images: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.title: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.rating: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
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
    private boolean onChangeImagesBean(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesBean, int fieldId) {
        switch (fieldId) {
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
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
    private boolean onChangeRatingBean(com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean ratingBean, int fieldId) {
        switch (fieldId) {
            case BR.average: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
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
        java.lang.String averageRatingBean = null;
        java.lang.String androidStringStringR = null;
        java.lang.String largeImagesBean = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean bean = mBean;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean imagesBean = null;
        java.lang.String titleBean = null;
        com.example.jingbin.cloudreader.bean.book.BooksBean.RatingBean ratingBean = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x53L) != 0) {

                    if (bean != null) {
                        // read bean.images
                        imagesBean = bean.getImages();
                    }
                    updateRegistration(1, imagesBean);


                    if (imagesBean != null) {
                        // read bean.images.large
                        largeImagesBean = imagesBean.getLarge();
                    }
            }
            if ((dirtyFlags & 0x49L) != 0) {

                    if (bean != null) {
                        // read bean.title
                        titleBean = bean.getTitle();
                    }
            }
            if ((dirtyFlags & 0x65L) != 0) {

                    if (bean != null) {
                        // read bean.rating
                        ratingBean = bean.getRating();
                    }
                    updateRegistration(2, ratingBean);


                    if (ratingBean != null) {
                        // read bean.rating.average
                        averageRatingBean = ratingBean.getAverage();
                    }


                    // read (@android:string/string_rating) + (bean.rating.average)
                    androidStringStringR = (tvRate.getResources().getString(R.string.string_rating)) + (averageRatingBean);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x53L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showBookImg(this.ivTopPhoto, largeImagesBean);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, titleBean);
        }
        if ((dirtyFlags & 0x65L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, androidStringStringR);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemBookBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_book, root, attachToRoot, bindingComponent);
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_book, null, false), bindingComponent);
    }
    public static ItemBookBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemBookBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_book_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemBookBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bean
        flag 1 (0x2L): bean.images
        flag 2 (0x3L): bean.rating
        flag 3 (0x4L): bean.title
        flag 4 (0x5L): bean.images.large
        flag 5 (0x6L): bean.rating.average
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}