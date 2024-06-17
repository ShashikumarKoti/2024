import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { UserAuthModule } from './user-auth/user-auth.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserListComponent } from './user-list/user-list.component';
import { ComponentWithInlineStyleComponent } from './component-with-inline-style/component-with-inline-style.component';
import { ComponentWithInlineTemplateComponent } from './component-with-inline-template/component-with-inline-template.component';
import { ComponentWithInlineTemplateAndInlineStyleComponent } from './component-with-inline-template-and-inline-style/component-with-inline-template-and-inline-style.component';
import { EventsLearningComponent } from './events-learning/events-learning.component';
import { InputBoxComponent } from './input-box/input-box.component';
import { CounterExampleComponent } from './counter-example/counter-example.component';
import { PropertyBindingDemoComponent } from './property-binding-demo/property-binding-demo.component';
import { ForLoopsLearningComponent } from './for-loops-learning/for-loops-learning.component';
import { StyleBindingLearningComponent } from './style-binding-learning/style-binding-learning.component';
import { HeaderComponent } from './header/header.component';
import { BasicAngularFormComponent } from './basic-angular-form/basic-angular-form.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    UserListComponent,
    ComponentWithInlineStyleComponent,
    ComponentWithInlineTemplateComponent,
    ComponentWithInlineTemplateAndInlineStyleComponent,
    EventsLearningComponent,
    InputBoxComponent,
    CounterExampleComponent,
    PropertyBindingDemoComponent,
    ForLoopsLearningComponent,
    StyleBindingLearningComponent,
    HeaderComponent,
    BasicAngularFormComponent
  ],
  imports: [
    BrowserModule,
    UserAuthModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
