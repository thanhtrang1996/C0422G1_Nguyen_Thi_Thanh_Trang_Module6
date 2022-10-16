import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import {NgxPaginationModule} from "ngx-pagination";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";
import {FooterComponent} from './component/footer/footer.component';
import {NavbarComponent} from './component/navbar/navbar.component';
import {Home1Component} from './component/home1/home1.component';
import { ListSearchComponent } from './component/list-search/list-search.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    NavbarComponent,
    Home1Component,
    ListSearchComponent,

  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule,
      HttpClientModule,
      NgxPaginationModule,
      BrowserAnimationsModule,
      ToastrModule.forRoot(
        {
          timeOut: 2000,
          closeButton: true,
          progressBar: true,
          positionClass: 'toast-top-center',
          preventDuplicates: true
        }
      ),
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
