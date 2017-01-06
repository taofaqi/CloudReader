
package android.databinding;
import com.example.jingbin.cloudreader.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 19;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.jingbin.cloudreader.R.layout.fragment_one:
                    return com.example.jingbin.cloudreader.databinding.FragmentOneBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.header_item_everyday:
                    return com.example.jingbin.cloudreader.databinding.HeaderItemEverydayBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_slide_scrool_view:
                    return com.example.jingbin.cloudreader.databinding.ActivitySlideScroolViewBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.app_bar_main:
                    return com.example.jingbin.cloudreader.databinding.AppBarMainBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_header_base:
                    return com.example.jingbin.cloudreader.databinding.ActivityHeaderBaseBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_one:
                    return com.example.jingbin.cloudreader.databinding.ItemOneBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_welfare:
                    return com.example.jingbin.cloudreader.databinding.FragmentWelfareBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_everyday_three:
                    return com.example.jingbin.cloudreader.databinding.ItemEverydayThreeBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_movie_detail:
                    return com.example.jingbin.cloudreader.databinding.ActivityMovieDetailBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_android:
                    return com.example.jingbin.cloudreader.databinding.ItemAndroidBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_everyday:
                    return com.example.jingbin.cloudreader.databinding.FragmentEverydayBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_list:
                    return com.example.jingbin.cloudreader.databinding.ItemListBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_nav_about:
                    return com.example.jingbin.cloudreader.databinding.ActivityNavAboutBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_douban_top:
                    return com.example.jingbin.cloudreader.databinding.ItemDoubanTopBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_movie_detail:
                    return com.example.jingbin.cloudreader.databinding.ItemMovieDetailBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view:
                    return com.example.jingbin.cloudreader.databinding.ActivitySlideShadeViewBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.footer_item_book:
                    return com.example.jingbin.cloudreader.databinding.FooterItemBookBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.header_book_detail:
                    return com.example.jingbin.cloudreader.databinding.HeaderBookDetailBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.home_middle_layout:
                    return com.example.jingbin.cloudreader.databinding.HomeMiddleLayoutBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_base:
                    return com.example.jingbin.cloudreader.databinding.FragmentBaseBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_book_detail:
                    return com.example.jingbin.cloudreader.databinding.ActivityBookDetailBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_base:
                    return com.example.jingbin.cloudreader.databinding.ActivityBaseBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_nav_home_page:
                    return com.example.jingbin.cloudreader.databinding.ActivityNavHomePageBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_nav_download:
                    return com.example.jingbin.cloudreader.databinding.ActivityNavDownloadBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_android:
                    return com.example.jingbin.cloudreader.databinding.FragmentAndroidBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.nav_header_main:
                    return com.example.jingbin.cloudreader.databinding.NavHeaderMainBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.footer_item_everyday:
                    return com.example.jingbin.cloudreader.databinding.FooterItemEverydayBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_book:
                    return com.example.jingbin.cloudreader.databinding.FragmentBookBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_splash:
                    return com.example.jingbin.cloudreader.databinding.ActivitySplashBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_everyday_title:
                    return com.example.jingbin.cloudreader.databinding.ItemEverydayTitleBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_everyday_two:
                    return com.example.jingbin.cloudreader.databinding.ItemEverydayTwoBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_welfare:
                    return com.example.jingbin.cloudreader.databinding.ItemWelfareBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_book:
                    return com.example.jingbin.cloudreader.databinding.ItemBookBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_main:
                    return com.example.jingbin.cloudreader.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_transition:
                    return com.example.jingbin.cloudreader.databinding.ActivityTransitionBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_nav_deed_back:
                    return com.example.jingbin.cloudreader.databinding.ActivityNavDeedBackBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.base_header_title_bar:
                    return com.example.jingbin.cloudreader.databinding.BaseHeaderTitleBarBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_custom:
                    return com.example.jingbin.cloudreader.databinding.FragmentCustomBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.header_slide_shape:
                    return com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_everyday_one:
                    return com.example.jingbin.cloudreader.databinding.ItemEverydayOneBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_movie_header:
                    return com.example.jingbin.cloudreader.databinding.ActivityMovieHeaderBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_book_custom:
                    return com.example.jingbin.cloudreader.databinding.FragmentBookCustomBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_slide:
                    return com.example.jingbin.cloudreader.databinding.ActivitySlideBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.fragment_gank:
                    return com.example.jingbin.cloudreader.databinding.FragmentGankBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_movie_detail_person:
                    return com.example.jingbin.cloudreader.databinding.ItemMovieDetailPersonBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.header_item_book:
                    return com.example.jingbin.cloudreader.databinding.HeaderItemBookBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_douban_top:
                    return com.example.jingbin.cloudreader.databinding.ActivityDoubanTopBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail:
                    return com.example.jingbin.cloudreader.databinding.ActivityOneMovieDetailBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.item_empty:
                    return com.example.jingbin.cloudreader.databinding.ItemEmptyBinding.bind(view, bindingComponent);
                case com.example.jingbin.cloudreader.R.layout.activity_test:
                    return com.example.jingbin.cloudreader.databinding.ActivityTestBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -445214867: {
                if(tag.equals("layout/fragment_one_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_one;
                }
                break;
            }
            case -1628088943: {
                if(tag.equals("layout/header_item_everyday_0")) {
                    return com.example.jingbin.cloudreader.R.layout.header_item_everyday;
                }
                break;
            }
            case 566947154: {
                if(tag.equals("layout/activity_slide_scrool_view_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_slide_scrool_view;
                }
                break;
            }
            case -85764295: {
                if(tag.equals("layout/app_bar_main_0")) {
                    return com.example.jingbin.cloudreader.R.layout.app_bar_main;
                }
                break;
            }
            case -108188791: {
                if(tag.equals("layout/activity_header_base_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_header_base;
                }
                break;
            }
            case 1201132656: {
                if(tag.equals("layout/item_one_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_one;
                }
                break;
            }
            case -1678419693: {
                if(tag.equals("layout/fragment_welfare_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_welfare;
                }
                break;
            }
            case 1301340344: {
                if(tag.equals("layout/item_everyday_three_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_everyday_three;
                }
                break;
            }
            case 1091194684: {
                if(tag.equals("layout/activity_movie_detail_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_movie_detail;
                }
                break;
            }
            case 690547129: {
                if(tag.equals("layout/item_android_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_android;
                }
                break;
            }
            case 1508334844: {
                if(tag.equals("layout/fragment_everyday_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_everyday;
                }
                break;
            }
            case -1509659626: {
                if(tag.equals("layout/item_list_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_list;
                }
                break;
            }
            case 771016055: {
                if(tag.equals("layout/activity_nav_about_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_nav_about;
                }
                break;
            }
            case -1013547117: {
                if(tag.equals("layout/item_douban_top_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_douban_top;
                }
                break;
            }
            case 1501135928: {
                if(tag.equals("layout/item_movie_detail_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_movie_detail;
                }
                break;
            }
            case 622988545: {
                if(tag.equals("layout/activity_slide_shade_view_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view;
                }
                break;
            }
            case -351113881: {
                if(tag.equals("layout/footer_item_book_0")) {
                    return com.example.jingbin.cloudreader.R.layout.footer_item_book;
                }
                break;
            }
            case 1866715115: {
                if(tag.equals("layout/header_book_detail_0")) {
                    return com.example.jingbin.cloudreader.R.layout.header_book_detail;
                }
                break;
            }
            case 1277326890: {
                if(tag.equals("layout/home_middle_layout_0")) {
                    return com.example.jingbin.cloudreader.R.layout.home_middle_layout;
                }
                break;
            }
            case -1300519380: {
                if(tag.equals("layout/fragment_base_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_base;
                }
                break;
            }
            case -1239648339: {
                if(tag.equals("layout/activity_book_detail_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_book_detail;
                }
                break;
            }
            case 109121677: {
                if(tag.equals("layout/activity_base_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_base;
                }
                break;
            }
            case -1896249639: {
                if(tag.equals("layout/activity_nav_home_page_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_nav_home_page;
                }
                break;
            }
            case 464875040: {
                if(tag.equals("layout/activity_nav_download_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_nav_download;
                }
                break;
            }
            case -217588170: {
                if(tag.equals("layout/fragment_android_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_android;
                }
                break;
            }
            case -477551781: {
                if(tag.equals("layout/nav_header_main_0")) {
                    return com.example.jingbin.cloudreader.R.layout.nav_header_main;
                }
                break;
            }
            case -1788654433: {
                if(tag.equals("layout/footer_item_everyday_0")) {
                    return com.example.jingbin.cloudreader.R.layout.footer_item_everyday;
                }
                break;
            }
            case -1287703484: {
                if(tag.equals("layout/fragment_book_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_book;
                }
                break;
            }
            case 1573928931: {
                if(tag.equals("layout/activity_splash_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_splash;
                }
                break;
            }
            case 1332025074: {
                if(tag.equals("layout/item_everyday_title_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_everyday_title;
                }
                break;
            }
            case 1275539494: {
                if(tag.equals("layout/item_everyday_two_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_everyday_two;
                }
                break;
            }
            case -770284394: {
                if(tag.equals("layout/item_welfare_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_welfare;
                }
                break;
            }
            case -1790537823: {
                if(tag.equals("layout/item_book_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_book;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_main;
                }
                break;
            }
            case 267895249: {
                if(tag.equals("layout/activity_transition_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_transition;
                }
                break;
            }
            case -1902241776: {
                if(tag.equals("layout/activity_nav_deed_back_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_nav_deed_back;
                }
                break;
            }
            case -44997644: {
                if(tag.equals("layout/base_header_title_bar_0")) {
                    return com.example.jingbin.cloudreader.R.layout.base_header_title_bar;
                }
                break;
            }
            case -1931202484: {
                if(tag.equals("layout/fragment_custom_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_custom;
                }
                break;
            }
            case 1171843607: {
                if(tag.equals("layout/header_slide_shape_0")) {
                    return com.example.jingbin.cloudreader.R.layout.header_slide_shape;
                }
                break;
            }
            case 1270644160: {
                if(tag.equals("layout/item_everyday_one_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_everyday_one;
                }
                break;
            }
            case -1068795272: {
                if(tag.equals("layout/activity_movie_header_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_movie_header;
                }
                break;
            }
            case -155759538: {
                if(tag.equals("layout/fragment_book_custom_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_book_custom;
                }
                break;
            }
            case 1596128311: {
                if(tag.equals("layout/activity_slide_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_slide;
                }
                break;
            }
            case -1157516814: {
                if(tag.equals("layout/fragment_gank_0")) {
                    return com.example.jingbin.cloudreader.R.layout.fragment_gank;
                }
                break;
            }
            case 821921982: {
                if(tag.equals("layout/item_movie_detail_person_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_movie_detail_person;
                }
                break;
            }
            case 1508032345: {
                if(tag.equals("layout/header_item_book_0")) {
                    return com.example.jingbin.cloudreader.R.layout.header_item_book;
                }
                break;
            }
            case -1876542569: {
                if(tag.equals("layout/activity_douban_top_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_douban_top;
                }
                break;
            }
            case -852420427: {
                if(tag.equals("layout/activity_one_movie_detail_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail;
                }
                break;
            }
            case -1360594089: {
                if(tag.equals("layout/item_empty_0")) {
                    return com.example.jingbin.cloudreader.R.layout.item_empty;
                }
                break;
            }
            case 628154894: {
                if(tag.equals("layout/activity_test_0")) {
                    return com.example.jingbin.cloudreader.R.layout.activity_test;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"aka"
            ,"alt"
            ,"alt_title"
            ,"author"
            ,"author_intro"
            ,"avatars"
            ,"average"
            ,"bean"
            ,"binding"
            ,"bookDetailBean"
            ,"books"
            ,"booksBean"
            ,"casts"
            ,"catalog"
            ,"collect_count"
            ,"comments_count"
            ,"count"
            ,"countries"
            ,"current_season"
            ,"directors"
            ,"do_count"
            ,"douban_site"
            ,"episodes_count"
            ,"gankBean"
            ,"genres"
            ,"id"
            ,"image"
            ,"images"
            ,"isbn10"
            ,"isbn13"
            ,"large"
            ,"max"
            ,"medium"
            ,"min"
            ,"mobile_url"
            ,"movieDetailBean"
            ,"name"
            ,"numRaters"
            ,"origin_title"
            ,"original_title"
            ,"pages"
            ,"personBean"
            ,"price"
            ,"pubdate"
            ,"publisher"
            ,"rating"
            ,"ratings_count"
            ,"resultsBean"
            ,"reviews_count"
            ,"schedule_url"
            ,"seasons_count"
            ,"share_url"
            ,"small"
            ,"stars"
            ,"start"
            ,"string"
            ,"subjects"
            ,"subjectsBean"
            ,"subtitle"
            ,"subtype"
            ,"summary"
            ,"tags"
            ,"title"
            ,"total"
            ,"translator"
            ,"type"
            ,"url"
            ,"wish_count"
            ,"year"};
    }
}